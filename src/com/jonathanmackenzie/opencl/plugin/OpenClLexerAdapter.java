package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class OpenClLexerAdapter extends FlexAdapter {
  public OpenClLexerAdapter() {
    super(new OpenClLexer((Reader) null));
  }
}
