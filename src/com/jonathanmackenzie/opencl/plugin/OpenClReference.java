package com.jonathanmackenzie.opencl.plugin;

import com.intellij.codeInsight.lookup.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClProperty;
import org.jetbrains.annotations.*;

import java.util.*;

public class OpenClReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
  private String key;

  public OpenClReference(@NotNull PsiElement element, TextRange textRange) {
    super(element, textRange);
    key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
  }

  @NotNull
  @Override
  public ResolveResult[] multiResolve(boolean incompleteCode) {
    Project project = myElement.getProject();
    final List<OpenClProperty> properties = OpenClUtil.findProperties(project, key);
    List<ResolveResult> results = new ArrayList<ResolveResult>();
    for (OpenClProperty property : properties) {
      results.add(new PsiElementResolveResult(property));
    }
    return results.toArray(new ResolveResult[results.size()]);
  }

  @Nullable
  @Override
  public PsiElement resolve() {
    ResolveResult[] resolveResults = multiResolve(false);
    return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    Project project = myElement.getProject();
    List<OpenClProperty> properties = OpenClUtil.findProperties(project);
    List<LookupElement> variants = new ArrayList<LookupElement>();
    for (final OpenClProperty property : properties) {
      if (property.getKey() != null && property.getKey().length() > 0) {
        variants.add(LookupElementBuilder.create(property).
            withIcon(OpenClIcons.FILE).
                                             withTypeText(property.getContainingFile().getName())
        );
      }
    }
    return variants.toArray();
  }
}