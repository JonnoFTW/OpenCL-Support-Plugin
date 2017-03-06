package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lang.Language;

/**
 *
 */
public class OpenClLanguage extends Language {

    public static final OpenClLanguage INSTANCE = new OpenClLanguage();

    private OpenClLanguage() {
        super("OpenCl");
    }
}
