// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenCLFunctionDefinition extends PsiElement {

  @NotNull
  OpenCLCompoundStat getCompoundStat();

  @Nullable
  OpenCLDeclList getDeclList();

  @Nullable
  OpenCLDeclSpecs getDeclSpecs();

  @NotNull
  OpenCLDeclarator getDeclarator();

}
