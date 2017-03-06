// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenCLTypeSpec extends PsiElement {

  @Nullable
  OpenCLEnumSpec getEnumSpec();

  @Nullable
  OpenCLMemorySpec getMemorySpec();

  @Nullable
  OpenCLStructOrUnionSpec getStructOrUnionSpec();

  @Nullable
  OpenCLTypeSpec getTypeSpec();

  @Nullable
  OpenCLTypedefName getTypedefName();

  @Nullable
  OpenCLVectorSize getVectorSize();

  @Nullable
  OpenCLVectorType getVectorType();

}
