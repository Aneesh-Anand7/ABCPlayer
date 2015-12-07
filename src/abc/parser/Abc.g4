/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: (line)+ EOF;
line: (element)+ NEWLINE | bodyvoice | COMMENT;
element: noteelem | tupletelem | barline | nthrepeat | WHITESPACE;

noteelem: note | multinote;
/* notes can be notes or rests */
note: noteorrest notelength?;
noteorrest: pitch | rest;
pitch: accidental? basenote octave?;
octave: OCTAVE;
notelength: (DIGIT+) ('/' (DIGIT+)?)?;
/* ^ is sharp, _ is flat, = is neutral */
accidental: ACCIDENTAL;
basenote: BASENOTE;
rest: 'z';
/* tuplets */
tupletelem: tupletspec noteelem+;
tupletspec: '(' DIGIT;
/* chords */
multinote: '[' note+ ']';
/* barlines */
barline: '|'|'||'|'[|'|'|]'|':|'|'|:';
nthrepeat: '[1'|'[2';


bodyvoice: BODYVOICE;
BODYVOICE: 'V: ' ([A-Za-z.0-9])+ ('\n' | '\r'('\n')?);

COMMENT: '%' ([A-Za-z.])+ ('\n' | '\r'('\n')?);
endofline: COMMENT | NEWLINE;

ACCIDENTAL:  '^'|'^^'|'_'|'__'|'=';
BASENOTE: ('C'|'D'|'E'|'F'|'G'|'A'|'B'|'c'|'d'|'e'|'f'|'g'|'a'|'b');
OCTAVE: '\''+ | ','+;
DIGIT: [0-9];
NEWLINE: '\n' | '\r'('\n')?;
WHITESPACE: ' ' | '\t';

