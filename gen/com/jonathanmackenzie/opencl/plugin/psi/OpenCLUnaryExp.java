// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenCLUnaryExp extends PsiElement {

  @Nullable
  OpenCLCastExp getCastExp();

  @Nullable
  OpenCLPostfixExp getPostfixExp();

  @Nullable
  OpenCLTypeName getTypeName();

  @Nullable
  OpenCLUnaryExp getUnaryExp();

  @Nullable
  OpenCLUnaryOperator getUnaryOperator();

}
