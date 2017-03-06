package com.jonathanmackenzie.opencl.plugin;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.*;
import com.intellij.navigation.*;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.jonathanmackenzie.opencl.plugin.psi.*;

import java.util.*;

public class OpenClStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
  private PsiElement element;

  public OpenClStructureViewElement(PsiElement element) {
    this.element = element;
  }

  @Override
  public Object getValue() {
    return element;
  }

  @Override
  public void navigate(boolean requestFocus) {
    if (element instanceof NavigationItem) {
      ((NavigationItem) element).navigate(requestFocus);
    }
  }

  @Override
  public boolean canNavigate() {
    return element instanceof NavigationItem &&
           ((NavigationItem) element).canNavigate();
  }

  @Override
  public boolean canNavigateToSource() {
    return element instanceof NavigationItem &&
           ((NavigationItem) element).canNavigateToSource();
  }

  @Override
  public String getAlphaSortKey() {
    return element instanceof PsiNamedElement ? ((PsiNamedElement) element).getName() : null;
  }

  @Override
  public ItemPresentation getPresentation() {
    return element instanceof NavigationItem ?
        ((NavigationItem) element).getPresentation() : null;
  }

  @Override
  public TreeElement[] getChildren() {
    if (element instanceof OpenClFile) {
      OpenClProperty[] properties = PsiTreeUtil.getChildrenOfType(element, OpenClProperty.class);
      List<TreeElement> treeElements = new ArrayList<TreeElement>(properties.length);
      for (OpenClProperty property : properties) {
        treeElements.add(new OpenClStructureViewElement(property));
      }
      return treeElements.toArray(new TreeElement[treeElements.size()]);
    } else {
      return EMPTY_ARRAY;
    }
  }
}