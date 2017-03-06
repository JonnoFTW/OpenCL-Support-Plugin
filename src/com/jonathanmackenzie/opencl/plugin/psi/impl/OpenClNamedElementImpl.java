package com.jonathanmackenzie.opencl.plugin.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClNamedELement;
import org.jetbrains.annotations.NotNull;

public abstract class OpenClNamedElementImpl extends ASTWrapperPsiElement implements OpenClNamedELement {
    public OpenClNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}