package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lang.cacheBuilder.*;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.*;
import com.intellij.psi.tree.TokenSet;
import com.jonathanmackenzie.opencl.plugin.psi.*;
import org.jetbrains.annotations.*;

public class OpenClFindUsagesProvider implements FindUsagesProvider {
  @Nullable
  @Override
  public WordsScanner getWordsScanner() {
    return new DefaultWordsScanner(new OpenClLexerAdapter(),
                                   TokenSet.create(OpenClTypes.KEY),
                                   TokenSet.create(OpenClTypes.COMMENT),
                                   TokenSet.EMPTY);
  }

  @Override
  public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
    return psiElement instanceof PsiNamedElement;
  }

  @Nullable
  @Override
  public String getHelpId(@NotNull PsiElement psiElement) {
    return null;
  }

  @NotNull
  @Override
  public String getType(@NotNull PsiElement element) {
    if (element instanceof OpenClProperty) {
      return "simple property";
    } else {
      return "";
    }
  }

  @NotNull
  @Override
  public String getDescriptiveName(@NotNull PsiElement element) {
    if (element instanceof OpenClProperty) {
      return ((OpenClProperty) element).getKey();
    } else {
      return "";
    }
  }

  @NotNull
  @Override
  public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
    if (element instanceof OpenClProperty) {
      return ((OpenClProperty) element).getKey() + ":" + ((OpenClProperty) element).getValue();
    } else {
      return "";
    }
  }
}
