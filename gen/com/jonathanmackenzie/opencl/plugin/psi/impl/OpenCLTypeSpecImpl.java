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

public class OpenCLTypeSpecImpl extends ASTWrapperPsiElement implements OpenCLTypeSpec {

  public OpenCLTypeSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull OpenCLVisitor visitor) {
    visitor.visitTypeSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof OpenCLVisitor) accept((OpenCLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public OpenCLEnumSpec getEnumSpec() {
    return findChildByClass(OpenCLEnumSpec.class);
  }

  @Override
  @Nullable
  public OpenCLMemorySpec getMemorySpec() {
    return findChildByClass(OpenCLMemorySpec.class);
  }

  @Override
  @Nullable
  public OpenCLStructOrUnionSpec getStructOrUnionSpec() {
    return findChildByClass(OpenCLStructOrUnionSpec.class);
  }

  @Override
  @Nullable
  public OpenCLTypeSpec getTypeSpec() {
    return findChildByClass(OpenCLTypeSpec.class);
  }

  @Override
  @Nullable
  public OpenCLTypedefName getTypedefName() {
    return findChildByClass(OpenCLTypedefName.class);
  }

  @Override
  @Nullable
  public OpenCLVectorSize getVectorSize() {
    return findChildByClass(OpenCLVectorSize.class);
  }

  @Override
  @Nullable
  public OpenCLVectorType getVectorType() {
    return findChildByClass(OpenCLVectorType.class);
  }

}
