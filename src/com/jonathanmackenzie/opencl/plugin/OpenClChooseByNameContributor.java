package com.jonathanmackenzie.opencl.plugin;

import com.intellij.navigation.*;
import com.intellij.openapi.project.Project;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClProperty;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class OpenClChooseByNameContributor implements ChooseByNameContributor {
  @NotNull
  @Override
  public String[] getNames(Project project, boolean includeNonProjectItems) {
    List<OpenClProperty> properties = OpenClUtil.findProperties(project);
    List<String> names = new ArrayList<String>(properties.size());
    for (OpenClProperty property : properties) {
      if (property.getKey() != null && property.getKey().length() > 0) {
        names.add(property.getKey());
      }
    }
    return names.toArray(new String[names.size()]);
  }

  @NotNull
  @Override
  public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
    // todo include non project items
    List<OpenClProperty> properties = OpenClUtil.findProperties(project, name);
    return properties.toArray(new NavigationItem[properties.size()]);
  }
}