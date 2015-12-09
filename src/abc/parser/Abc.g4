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
notelength: NOTELENGTH;
/* ^ is sharp, _ is flat, = is neutral */
accidental: ACCIDENTAL;
basenote: BASENOTE;
rest: 'z';
/* tuplets */
tupletelem: tupletspec noteelem+;
tupletspec: TUPLETSPEC;
/* chords */
multinote: '[' note+ ']';
/* barlines */
barline: '|'|'||'|'[|'|'|]'|':|'|'|:';
nthrepeat: NTHREPEAT;
bodyvoice: BODYVOICE;

TUPLETSPEC: '(' [0-9];
NTHREPEAT: '[1'|'[2';
NOTELENGTH: ([0-9]+)? ('/' ([0-9]+)?)?;
BODYVOICE: ('V: '|'V:') ([A-Za-z.0-9])+ ('\n' | '\r'('\n')?);
COMMENT: '%' ([A-Za-z.])* ('\n' | '\r'('\n')?);

endofline: COMMENT | NEWLINE;

ACCIDENTAL:  '^'|'^^'|'_'|'__'|'=';
BASENOTE: ('C'|'D'|'E'|'F'|'G'|'A'|'B'|'c'|'d'|'e'|'f'|'g'|'a'|'b');
OCTAVE: '\''+ | ','+;
DIGIT: [0-9];
NEWLINE: '\n' | '\r'('\n')?;
WHITESPACE: ' ' | '\t';

