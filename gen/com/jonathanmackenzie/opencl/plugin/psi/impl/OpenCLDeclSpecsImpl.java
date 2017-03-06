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

public class OpenCLDeclSpecsImpl extends ASTWrapperPsiElement implements OpenCLDeclSpecs {

  public OpenCLDeclSpecsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitDeclSpecs(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLDeclSpecs getDeclSpecs() {
    return findChildByClass(OpenCLDeclSpecs.class);
  }

  @Override
  @Nullable
  public OpenCLStorageClassSpec getStorageClassSpec() {
    return findChildByClass(OpenCLStorageClassSpec.class);
  }

  @Override
  @Nullable
  public OpenCLTypeQualifier getTypeQualifier() {
    return findChildByClass(OpenCLTypeQualifier.class);
  }

  @Override
  @Nullable
  public OpenCLTypeSpec getTypeSpec() {
    return findChildByClass(OpenCLTypeSpec.class);
  }

}
