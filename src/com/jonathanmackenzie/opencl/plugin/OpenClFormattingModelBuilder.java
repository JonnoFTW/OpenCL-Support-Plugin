package com.jonathanmackenzie.opencl.plugin;

import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClTypes;
import org.jetbrains.annotations.*;

public class OpenClFormattingModelBuilder implements FormattingModelBuilder {
  @NotNull
  @Override
  public FormattingModel createModel(PsiElement element, CodeStyleSettings settings) {
    return FormattingModelProvider.createFormattingModelForPsiFile(element.getContainingFile(),
                                                                   new OpenClBlock(element.getNode(),
                                                                                   Wrap.createWrap(WrapType.NONE,
                                                                                                   false),
                                                                                   Alignment.createAlignment(),
                                                                                   createSpaceBuilder(settings)),
                                                                   settings);
  }

  private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
    return new SpacingBuilder(settings, OpenClLanguage.INSTANCE).
                                                                    around(OpenClTypes.SEPARATOR)
                                                                .spaceIf(settings.SPACE_AROUND_ASSIGNMENT_OPERATORS)
                                                                .
                                                                    before(OpenClTypes.PROPERTY)
                                                                .none();
  }

  @Nullable
  @Override
  public TextRange getRangeAffectingIndent(PsiFile file, int offset, ASTNode elementAtOffset) {
    return null;
  }
}