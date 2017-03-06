package com.jonathanmackenzie.opencl.plugin;

import com.intellij.ide.structureView.*;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClFile;
import org.jetbrains.annotations.NotNull;

public class OpenClStructureViewModel extends StructureViewModelBase implements
    StructureViewModel.ElementInfoProvider {
  public OpenClStructureViewModel(PsiFile psiFile) {
    super(psiFile, new OpenClStructureViewElement(psiFile));
  }

  @NotNull
  public Sorter[] getSorters() {
    return new Sorter[]{Sorter.ALPHA_SORTER};
  }


  @Override
  public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
    return false;
  }

  @Override
  public boolean isAlwaysLeaf(StructureViewTreeElement element) {
    return element instanceof OpenClFile;
  }
}