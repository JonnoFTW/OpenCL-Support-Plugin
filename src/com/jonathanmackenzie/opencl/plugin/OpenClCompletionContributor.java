package com.jonathanmackenzie.opencl.plugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.jonathanmackenzie.opencl.plugin.psi.OpenClTypes;
import org.jetbrains.annotations.NotNull;

public class OpenClCompletionContributor extends CompletionContributor {
  public OpenClCompletionContributor() {
    extend(CompletionType.BASIC,
           PlatformPatterns.psiElement(OpenClTypes.VALUE).withLanguage(OpenClLanguage.INSTANCE),
           new CompletionProvider<CompletionParameters>() {
             public void addCompletions(@NotNull CompletionParameters parameters,
                                        ProcessingContext context,
                                        @NotNull CompletionResultSet resultSet) {
               resultSet.addElement(LookupElementBuilder.create("Hello"));
             }
           }
    );
  }
}
