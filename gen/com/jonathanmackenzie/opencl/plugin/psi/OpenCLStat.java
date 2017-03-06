// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface OpenCLStat extends PsiElement {

  @Nullable
  OpenCLCompoundStat getCompoundStat();

  @Nullable
  OpenCLExpStat getExpStat();

  @Nullable
  OpenCLIterationStat getIterationStat();

  @Nullable
  OpenCLJumpStat getJumpStat();

  @Nullable
  OpenCLLabeledStat getLabeledStat();

  @Nullable
  OpenCLSelectionStat getSelectionStat();

}
