package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClProperty;

public class OpenClRefactoringSupportProvider extends RefactoringSupportProvider {
  @Override
  public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
    return element instanceof OpenClProperty;
  }
}