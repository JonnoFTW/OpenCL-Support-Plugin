package com.jonathanmackenzie.opencl.plugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import com.jonathanmackenzie.opencl.plugin.OpenClIcons;
import com.jonathanmackenzie.opencl.plugin.psi.*;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class OpenClPsiImplUtil {
    public static String getKey(OpenClProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(OpenClTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(OpenClProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(OpenClTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(OpenClProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(OpenClProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(OpenClTypes.KEY);
        if (keyNode != null) {
            OpenClProperty property = OpenClElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(OpenClProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(OpenClTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final OpenClProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return OpenClIcons.FILE;
            }
        };
    }
}