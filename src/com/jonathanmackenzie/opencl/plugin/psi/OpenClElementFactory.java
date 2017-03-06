package com.jonathanmackenzie.opencl.plugin.psi;

import com.jonathanmackenzie.opencl.plugin.OpenClFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
/**
 * Created by mack0242 on 6/03/17.
 */
public class OpenClElementFactory {
    public static OpenClProperty createProperty(Project project, String name, String value) {
        final OpenClFile file = createFile(project, name + " = " + value);
        return (OpenClProperty) file.getFirstChild();
    }

    public static OpenClProperty createProperty(Project project, String name) {
        final OpenClFile file = createFile(project, name);
        return (OpenClProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final OpenClFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static OpenClFile createFile(Project project, String text) {
        String name = "dummy.simple";
        return (OpenClFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, OpenClFileType.INSTANCE, text);
    }

}
