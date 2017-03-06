// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenCLPostfixExp extends PsiElement {

  @Nullable
  OpenCLArgumentExpList getArgumentExpList();

  @Nullable
  OpenCLExp getExp();

  @Nullable
  OpenCLPostfixExp getPostfixExp();

  @Nullable
  OpenCLPrimaryExp getPrimaryExp();

}
