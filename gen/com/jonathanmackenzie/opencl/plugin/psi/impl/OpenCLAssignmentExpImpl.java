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

public class OpenCLAssignmentExpImpl extends ASTWrapperPsiElement implements OpenCLAssignmentExp {

  public OpenCLAssignmentExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitAssignmentExp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLAssignmentExp getAssignmentExp() {
    return findChildByClass(OpenCLAssignmentExp.class);
  }

  @Override
  @Nullable
  public OpenCLAssignmentOperator getAssignmentOperator() {
    return findChildByClass(OpenCLAssignmentOperator.class);
  }

  @Override
  @Nullable
  public OpenCLConditionalExp getConditionalExp() {
    return findChildByClass(OpenCLConditionalExp.class);
  }

  @Override
  @Nullable
  public OpenCLUnaryExp getUnaryExp() {
    return findChildByClass(OpenCLUnaryExp.class);
  }

}
