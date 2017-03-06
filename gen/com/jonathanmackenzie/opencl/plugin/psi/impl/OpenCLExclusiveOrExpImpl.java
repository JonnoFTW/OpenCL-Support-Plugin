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

public class OpenCLExclusiveOrExpImpl extends ASTWrapperPsiElement implements OpenCLExclusiveOrExp {

  public OpenCLExclusiveOrExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitExclusiveOrExp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public OpenCLAndExp getAndExp() {
    return findNotNullChildByClass(OpenCLAndExp.class);
  }

  @Override
  @Nullable
  public OpenCLExclusiveOrExp getExclusiveOrExp() {
    return findChildByClass(OpenCLExclusiveOrExp.class);
  }

}
