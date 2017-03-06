package com.jonathanmackenzie.opencl.plugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.*;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.jonathanmackenzie.opencl.plugin.psi.*;

import java.util.*;

public class OpenClUtil {
  public static List<OpenClProperty> findProperties(Project project, String key) {
    List<OpenClProperty> result = null;
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, OpenClFileType.INSTANCE,
                                                        GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      OpenClFile simpleFile = (OpenClFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (simpleFile != null) {
        OpenClProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, OpenClProperty.class);
        if (properties != null) {
          for (OpenClProperty property : properties) {
            if (key.equals(property.getKey())) {
              if (result == null) {
                result = new ArrayList<OpenClProperty>();
              }
              result.add(property);
            }
          }
        }
      }
    }
    return result != null ? result : Collections.<OpenClProperty>emptyList();
  }

  public static List<OpenClProperty> findProperties(Project project) {
    List<OpenClProperty> result = new ArrayList<OpenClProperty>();
    Collection<VirtualFile> virtualFiles =
        FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, OpenClFileType.INSTANCE,
                                                        GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      OpenClFile simpleFile = (OpenClFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (simpleFile != null) {
        OpenClProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, OpenClProperty.class);
        if (properties != null) {
          Collections.addAll(result, properties);
        }
      }
    }
    return result;
  }
}