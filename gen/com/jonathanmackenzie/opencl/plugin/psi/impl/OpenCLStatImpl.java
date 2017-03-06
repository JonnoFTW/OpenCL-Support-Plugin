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

public class OpenCLStatImpl extends ASTWrapperPsiElement implements OpenCLStat {

  public OpenCLStatImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitStat(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLCompoundStat getCompoundStat() {
    return findChildByClass(OpenCLCompoundStat.class);
  }

  @Override
  @Nullable
  public OpenCLExpStat getExpStat() {
    return findChildByClass(OpenCLExpStat.class);
  }

  @Override
  @Nullable
  public OpenCLIterationStat getIterationStat() {
    return findChildByClass(OpenCLIterationStat.class);
  }

  @Override
  @Nullable
  public OpenCLJumpStat getJumpStat() {
    return findChildByClass(OpenCLJumpStat.class);
  }

  @Override
  @Nullable
  public OpenCLLabeledStat getLabeledStat() {
    return findChildByClass(OpenCLLabeledStat.class);
  }

  @Override
  @Nullable
  public OpenCLSelectionStat getSelectionStat() {
    return findChildByClass(OpenCLSelectionStat.class);
  }

}
