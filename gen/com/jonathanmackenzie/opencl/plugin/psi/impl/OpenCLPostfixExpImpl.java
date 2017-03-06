// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.jonathanmackenzie.opencl.plugin.psi.OpenClTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.jonathanmackenzie.opencl.plugin.psi.*;

public class OpenCLPostfixExpImpl extends ASTWrapperPsiElement implements OpenCLPostfixExp {

  public OpenCLPostfixExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitPostfixExp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLArgumentExpList getArgumentExpList() {
    return findChildByClass(OpenCLArgumentExpList.class);
  }

  @Override
  @Nullable
  public OpenCLExp getExp() {
    return findChildByClass(OpenCLExp.class);
  }

  @Override
  @Nullable
  public OpenCLPostfixExp getPostfixExp() {
    return findChildByClass(OpenCLPostfixExp.class);
  }

  @Override
  @Nullable
  public OpenCLPrimaryExp getPrimaryExp() {
    return findChildByClass(OpenCLPrimaryExp.class);
  }

}
