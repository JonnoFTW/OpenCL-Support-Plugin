package com.jonathanmackenzie.opencl.plugin;

import com.intellij.application.options.*;
import com.intellij.openapi.options.Configurable;
import com.intellij.psi.codeStyle.*;
import org.jetbrains.annotations.*;

public class OpenClCodeStyleSettingsProvider extends CodeStyleSettingsProvider {
  @Override
  public CustomCodeStyleSettings createCustomSettings(CodeStyleSettings settings) {
    return new OpenClCodeStyleSettings(settings);
  }

  @Nullable
  @Override
  public String getConfigurableDisplayName() {
    return "OpenCl";
  }

  @NotNull
  @Override
  public Configurable createSettingsPage(CodeStyleSettings settings, CodeStyleSettings originalSettings) {
    return new CodeStyleAbstractConfigurable(settings, originalSettings, "OpenCl") {
      @Override
      protected CodeStyleAbstractPanel createPanel(CodeStyleSettings settings) {
        return new OpenClCodeStyleMainPanel(getCurrentSettings(), settings);
      }

      @Nullable
      @Override
      public String getHelpTopic() {
        return null;
      }
    };
  }

  private static class OpenClCodeStyleMainPanel extends TabbedLanguageCodeStylePanel {
    public OpenClCodeStyleMainPanel(CodeStyleSettings currentSettings, CodeStyleSettings settings) {
      super(OpenClLanguage.INSTANCE, currentSettings, settings);
    }
  }
}