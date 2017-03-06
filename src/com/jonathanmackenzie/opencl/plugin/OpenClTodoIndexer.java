package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lexer.Lexer;
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer;
import com.intellij.psi.impl.cache.impl.todo.LexerBasedTodoIndexer;

public class OpenClTodoIndexer extends LexerBasedTodoIndexer {
  @Override
  public Lexer createLexer(OccurrenceConsumer consumer) {
    return OpenClIdIndexer.createIndexingLexer(consumer);
  }
}
