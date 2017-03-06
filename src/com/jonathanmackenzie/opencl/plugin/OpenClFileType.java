package com.jonathanmackenzie.opencl.plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

/**
 *
 */
public class OpenClFileType extends LanguageFileType {
    @NonNls public static final String DEFAULT_EXTENSION = "cl";
    @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;
    public static final OpenClFileType INSTANCE = new OpenClFileType();

    private OpenClFileType() {
        super(OpenClLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "OpenCL File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Parses OpenCL kernel files";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return OpenClIcons.FILE;
    }
}
