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

public class OpenCLDirectAbstractDeclaratorImpl extends ASTWrapperPsiElement implements OpenCLDirectAbstractDeclarator {

  public OpenCLDirectAbstractDeclaratorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitDirectAbstractDeclarator(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLAbstractDeclarator getAbstractDeclarator() {
    return findChildByClass(OpenCLAbstractDeclarator.class);
  }

  @Override
  @Nullable
  public OpenCLConstExp getConstExp() {
    return findChildByClass(OpenCLConstExp.class);
  }

  @Override
  @Nullable
  public OpenCLDirectAbstractDeclarator getDirectAbstractDeclarator() {
    return findChildByClass(OpenCLDirectAbstractDeclarator.class);
  }

  @Override
  @Nullable
  public OpenCLParamTypeList getParamTypeList() {
    return findChildByClass(OpenCLParamTypeList.class);
  }

}
