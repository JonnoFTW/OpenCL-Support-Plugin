package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lexer.Lexer;
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer;
import com.intellij.psi.impl.cache.impl.id.LexerBasedIdIndexer;

public class OpenClIdIndexer extends LexerBasedIdIndexer {

  public static Lexer createIndexingLexer(OccurrenceConsumer consumer) {
    return new OpenClFilterLexer(new OpenClLexerAdapter(), consumer);
  }

  @Override
  public Lexer createLexer(final OccurrenceConsumer consumer) {
    return createIndexingLexer(consumer);
  }
}
