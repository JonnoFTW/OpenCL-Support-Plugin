package com.jonathanmackenzie.opencl.plugin.psi;


import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.jonathanmackenzie.opencl.plugin.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by mack0242 on 6/03/17.
 */
public class OpenClFile extends PsiFileBase {
    public OpenClFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, OpenClLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return OpenClFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "OpenCl File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}