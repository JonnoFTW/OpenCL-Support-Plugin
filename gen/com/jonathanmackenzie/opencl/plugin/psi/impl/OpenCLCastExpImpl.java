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

public class OpenCLCastExpImpl extends ASTWrapperPsiElement implements OpenCLCastExp {

  public OpenCLCastExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitCastExp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLCastExp getCastExp() {
    return findChildByClass(OpenCLCastExp.class);
  }

  @Override
  @Nullable
  public OpenCLTypeName getTypeName() {
    return findChildByClass(OpenCLTypeName.class);
  }

  @Override
  @Nullable
  public OpenCLUnaryExp getUnaryExp() {
    return findChildByClass(OpenCLUnaryExp.class);
  }

}
