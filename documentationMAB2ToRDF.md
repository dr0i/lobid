The first table consists of fields which will be no longer used in RDA. It builds on https://github.com/hbz/lobid/issues/161#issuecomment-272420198. The second table contains the rest.  

Number MAB2 | Field name MAB2 | if & how transformed to RDF
---------- | -------------- | ------------------------
300 | Sammlungsvermerk | -
304 | Einheitssachtitel | a → dc/terms/alternative
310 | Hauptsachtitel in Ansetzungsform | → Titel
333 | zu ergänzende Urheber zum Hauptsachtitel | If no title exists, set as title. Also taken as CorporateBodyTitle.
334 | Allgemeine Materialbenennung | Match with Bibo/AudioDocument, bibo/AudioVisualDocument, bibo/Image, RDACarrierType/1020 (Microform Carriers). Used for checking if full text is online.
340, 344, 348, 352 | Parallelsachtitel in Ansetzungsform | - 
342, 346, 350, 354 | zu ergänzende Urheber zum Parallelsachtitel | -
361 | Beigefügte Werke | -
410, 411, 412, 415, 416, 417, 418 | Alter Erscheinungsvermerk | -
454, 464, 474, 484, 494 | Gesamttitel in Ansetzungsform – wird auf Verbundebene entschieden! | -
502 | Einheitssachtitel eines beigefügten oder kommentierten Werkes | - 
504 | Angabe von Paralleltiteln | → dc/terms/alternative
517 | Angaben zum Inhalt  | -
519 | Alter Hochschulschriftenvermerk | If existing, multiple values are combined as RDA Elements/u/P60489
532 | Hinweise auf frühere und spätere sowie zeitweise gültige Titel | -
610 – 645 | Segment Sekundärformen | 619a (Erscheinungsjahr(e) in Vorlageform) matched with 021 (Identifikationsnummer der Primaerform)
652 | Spezifische Materialbenennung und Dateityp | a (stands for RAK-NBM) → Online ressource
653 | Physische Beschreibung der Computerdatei auf Datenträger | -
8XX | Segment Nichtstandardmäßige Nebeneintragungen | Matches with some GND-id?
9XX | Bei RSWK-Schlagwörtern erstes Unterfeld $f | Matches with some GND-id?

Number MAB2 | Field name MAB2 | if & how transformed to RDF
---------- | -------------- | ------------------------
001	| IDENTIFIKATIONSNUMMER DES DATENSATZES	| Contains subject URI / volume number
002	|	DATUM DER ERSTERFASSUNG / FREMDDATENUEBERNAHME | Mapped on dc/terms/modified, used for ns-lobid-resource/about
003	|	DATUM DER LETZTEN KORREKTUR | Mapped on dc/terms/modified
004	|	ERSTELLUNGSDATUM DES AUSTAUSCHSATZES | -
005	|	TRANSAKTIONSDATUM | -
006	|	VERSIONSNUMMER | -
010	|	IDENTIFIKATIONSNUMMER DES DIREKT UEBERGEORDNETEN DATENSATZES | Matched with a lobid-resource
011	|	IDENTIFIKATIONSNUMMER DER VERKNUEPFTEN SAETZE FUER PAUSCHALVERWEISUNGEN UND SIEHE-AUCH-HINWEISE | -
012	|	IDENTIFIKATIONSNUMMER DES TITELDATENSATZES (MAB-LOKAL) | -
015	|	IDENTIFIKATIONSNUMMER DES ZIELSATZES | -
016	|	IDENTIFIKATIONSNUMMER DES UMGELENKTEN SATZES | -
020	|	IDENTIFIKATIONSNUMMER EINES GELIEFERTEN DATENSATZES | -
021	|	IDENTIFIKATIONSNUMMER DER PRIMAERFORM | Matched with 619a and mapped to dc/terms/issued
022	|	IDENTIFIKATIONSNUMMER DER SEKUNDAERFORM | -
023	|	IDENTIFIKATIONSNUMMER DES ZU KORRIGIERENDEN SATZES | -
025	|	UEBERREGIONALE IDENTIFIKATIONSNUMMER | o and z mapped on ZDB-ID or OCLC number respectively, rest not used
026	|	REGIONALE IDENTIFIKATIONSNUMMER | -
027	|	LOKALE IDENTIFIKATIONSNUMMER | -
028	|	IDENTIFIKATIONSNUMMER VON NORMDATEN | -
029	|	SONSTIGE IDENTIFIKATIONSNUMMER DES VORLIEGENDEN DATENSATZES | -
030	|	CODIERTE ANGABEN ZUM DATENSATZ | -
031	|	ANGABEN ZUM REDAKTIONSSATZ | -
036	|	LAENDERCODE | -
037	|	SPRACHENCODE | Mapped on LoC-ISO-639-2
038	|	CODE FUER HERKUNFTSSPRACHE / SPRACHE DES ORIGINALS | -
039	|	ZEITCODE | -
040	|	NOTATION FUER NORMDATEN | -
041	|	NOTATIONSSPEZIFISCHE CODIERUNGEN | -
050	|	DATENTRAEGER | Mapping: 0.a -> rdvocab.info/termList/prodManuscript/1002 (wasn't found), 3 -> RDACarrierType/1020, 4.a -> purl.org/library/BrailleBook and RDAproductionMethod/1010, 5.a -> bibo/AudioDocument, 5.ad -> purl.org/library/CassetteTape, 5.b and 5.c -> bibo/AudioVisualDocument and RDACarrierType/1050, 5.d -> bibo/Image, 6.aj -> mo/Vinyl and bibo/AudioDocument, 7.a -> RDAproductionMethod/1010 and http://iflastandards.info/ns/isbd/terms/mediatype/T1008, 8 -> http://rdvocab.info/termList/RDACarrierType/1010, 9.a -> purl.org/library/Game, 10.a -> bibo/Map. Used for bibo/book if other publication types don't fit.
051	|	VEROEFFENTLICHUNGSSPEZIFISCHE ANGABEN ZU BEGRENZTEN WERKEN | Mapping: [nt]. -> bibo/MultiVolumeBook, , .b -> bibo/Bibliography, .d -> bibo/ReferenceSource, .e -> bibo/ReferenceSource, .f -> Festschrift, .h -> bibo/Biography, .k -> bibo/Proceedings, .l -> [ns-lobid-vocab]Legislation, .m -> mo/PublishedScore, , .n -> bibo/Standard, .r -> bibo/Report, .t -> bibo/Article, .u -> bibo/Thesis, .x -> bibo/Schoolbook, All Kennzeichnung Amtlicher Druckschriften -> [ns-lobid-vocab]OfficialPublication. Not used: .a, .c, .g, .i, .j, .o, .p, .q, .s, .v, .z. Used for bibo/book if 050 fits and other publication types don't.
052	|	VEROEFFENTLICHUNGSSPEZIFISCHE ANGABEN ZU FORTLAUFENDEN SAMMELWERKEN | Mapping:  .aa -> [ns-lobid-vocab]OfficialPublication, .ao -> bibo/Newspaper, .ag -> [ns-lobid-vocab]Legislation, .au -> bibo/Article, .bi -> [ns-lobid-vocab]Bibliography, .bg -> [ns-lobid-vocab]Biography,  .eo -> bibo/Newspaper, .ez  -> bibo/ReferenceSource, .il -> bibo/Journal, .ko -> bibo/Proceedings, .lp -> bibo/Newspaper, .mu -> .mo/PublishedScore, .no -> bibo/Standard, .rp -> bibo/Newspaper, sc -> bibo/Thesis, .se -> bibo/Series, .up -> bibo/Newspaper. Not used: .ab, .am, .az, .kt, .da, .di, .es, .ft, .fz, .fb, .ha, .in, .li, .lo, .me, .mg, .pa, .pt, .re, .rf, .rg, .so, .st, .ub, .uu, .xj. Used for bibo/book if 050 fits and other publication types don't.
053	|	NACHLAESSE UND AUTOGRAPHEN | -
057	|	MATERIALSPEZIFISCHE CODES FUER MIKROFORMEN | Mapped on RDACarrierType/1020
065	|	NORMDATENSPEZIFISCHE ANGABEN ZUR PND | -
066	|	NORMDATENSPEZIFISCHE ANGABEN ZUR GKD | -
067	|	NORMDATENSPEZIFISCHE ANGABEN ZUR SWD | -
068	|	NORMDATENSPEZIFISCHE CODIERUNGEN | -
070	|	IDENTIFIZIERUNGSMERKMALE DER BEARBEITENDEN INSTITUTION | -
071	|	IDENTIFIZIERUNGSMERKMALE DER BESITZENDEN INSTITUTION | -
072	|	CODIERTE ANGABEN ZUR BESITZENDEN INSTITUTION | -
073	|	SONDERSAMMELGEBIETSNUMMER | -
074	|	SONDERSAMMELGEBIETSNOTATION | -
075	|	ZDB-PRIORITAETSZAHL | -
076	|	FREI DEFINIERBARE ANWENDERSPEZIFISCHE ANGABEN, KENNZEICHEN UND CODES | -
079	|	FREI DEFINIERBARE ANWENDERSPEZIFISCHE ANGABEN, KENNZEICHEN UND CODES | -
080	|	ZUGRIFFS- UND UPDATE-ANWEISUNGEN | -
081	|	FREI DEFINIERBARE ANWENDERSPEZIFISCHE ANGABEN, KENNZEICHEN UND CODES | -
088	|	FREI DEFINIERBARE ANWENDERSPEZIFISCHE ANGABEN, KENNZEICHEN UND CODES | Used for creating reset item id.
089	|	Bandangaben in Vorlageform |
090	|	Bandangaben in Sortierform |
100	|	Name der 1. Person in Ansetzungsform |
101	|	Verweisungsformen zum Namen der 1. Person |
102	|	Identifikationsnummer des Personennamensatzes der 1. Person |
103	|	Körperschaft, bei der die 1. Person beschäftigt ist |
104	|	Name der 2. Person in Ansetzungsform |
105	|	Verweisungsformen zum Namen der 2. Person |
106	|	Identifikationsnummer des Personennamensatzes der 2. Person |
107	|	Körperschaft, bei der die 2. Person beschäftigt ist |
…	|	|
196	|	Name der 25. Person in Ansetzungsform |
197	|	Verweisungsformen zum Namen der 25. Person |
198	|	Identifikationsnummer des Personennamensatzes der 25. Person |
199	|	Körperschaft, bei der die 25. Person beschäftigt ist |
200	|	Name der 1. Körperschaft in Ansetzungsform |
201	|	Verweisungsformen zum Namen der 1. Körperschaft |
202	|	Identifikationsnummer des Körperschaftsnamensatzes der 1. Körperschaft |
204	|	Name der 2. Körperschaft in Ansetzungsform |
205	|	Verweisungsformen zum Namen der 2. Körperschaft |
206	|	Identifikationsnummer des Körperschaftsnamensatzes der 2. Körperschaft |
…	|	|
296	|	Name der 25. Körperschaft in Ansetzungsform |
297	|	Verweisungsformen zum Namen der 25. Körperschaft |
298 | Identifikationsnummer des Körperschaftsnamensatzes der 25. Körperschaft | 
305	|	Identifikationsnummer des Einheitssachtitelsatzes |
331	|	Hauptsachtitel in Vorlageform oder Mischform |
335	|	Zusätze zum Hauptsachtitel |
341	|	1. Parallelsachtitel in Vorlageform oder Mischform |
343	|	Zusätze zum 1. Parallelsachtitel |
345	|	2. Parallelsachtitel in Vorlageform oder Mischform |
347	|	Zusätze zum 2. Parallelsachtitel |
349	|	3. Parallelsachtitel in Vorlageform oder Mischform |
351	|	Zusätze zum 3. Parallelsachtitel |
353	|	4. Parallelsachtitel in Vorlageform oder Mischform |
355	|	Zusätze zum 4. Parallelsachtitel |
359	|	Verfasserangabe |
360	|	Unterreihen |
365	|	Zusätze zur gesamten Vorlage |
369	|	Verfasserangabe zur gesamten Vorlage |
370	|	Weitere Sachtitel |
376	|	Normierte Zeitschriftentitel |
400	|	Ausgabebezeichnung in normierter Form |
403	|	Ausgabebezeichnung in Vorlageform |
405	|	Erscheinungsverlauf |
406	|	Normierter Erscheinungsverlauf |
407	|	Kartographische Materialien: Mathematische Angaben |
420	|	Mehrteilige, unselbständig erschienene Werke: Zusammenfassende und offene Aufführung von Teilen |
425	|	Erscheinungsjahr(e) |
426	|	Datumsangaben |
427	|	Zusammenfassende Bestandsangaben |
429	|	Bestandslücken |
431	|	Zusammenfassende Register |
432	|	Zusammenfassende und offene Bandaufführung |
433	|	Umfangsangabe |
434	|	Illustrationsangabe / Technische Angaben zu Tonträgern |
435	|	Formatangabe |
437	|	Angabe von Begleitmaterialien |
451	|	1. Gesamttitel in Vorlageform |
452	|	Standardnummern des 1. Gesamttitels |
453	|	Identifikationsnummer des 1. Gesamttitels |
455	|	Bandangabe |
456	|	Bandangabe in Sortierform |
461	|	2. Gesamttitel in Vorlageform |
462	|	Standardnummern des 2. Gesamttitels |
463	|	Identifikationsnummer des 2. Gesamttitels |
465	|	Bandangabe |
466	|	Bandangabe in Sortierform |
471	|	3. Gesamttitel in Vorlageform |
472	|	Standardnummern des 3. Gesamttitels |
473	|	Identifikationsnummer des 3. Gesamttitels |
475	|	Bandangabe |
476	|	Bandangabe in Sortierform |
481	|	4. Gesamttitel in Vorlageform |
482	|	Standardnummern des 4. Gesamttitels |
483	|	Identifikationsnummer des 4. Gesamttitels |
485	|	Bandangabe |
486	|	Bandangabe in Sortierform |
491	|	5. Gesamttitel in Vorlageform |
492	|	Standardnummern des 5. Gesamttitels |
493	|	Identifikationsnummer des 5. Gesamttitels |
495	|	Bandangabe|
496	|	Bandangabe in Sortierform |
501	|	Sammelfeld für unaufgegliederte Fußnoten |
503	|	Deutsche Übersetzung des Hauptsachtitels bzw. Hinweis auf die musikalische Form |
505	|	Angabe von Nebentiteln |
507	|	Angaben zum Hauptsachtitel und zu den Zusätzen |
508	|	Angabe der Quelle der Aufnahme |
509	|	Vermerke zur Verfasserangabe |
510	|	Angaben zur Ausgabebezeichnung |
511	|	Angaben zum Erscheinungsvermerk |
512	|	Angaben zum Kollationsvermerk bzw. zur physischen Beschreibung |
513	|	Änderungen im Impressum |
515	|	Ergänzungen zur Gesamttitelangabe |
516	|	Angaben über Schrift, Sprache und Vollständigkeit der Vorlage und musikalische Notation |
518	|	Angabe der Namen von Interpreten bzw. weitere Angaben zur Interpretation |
522	|	Teilungsvermerk bei fortlaufenden Sammelwerken |
523	|	Angaben über Erscheinungsweise und Erscheinungsdauer |
524	|	Hinweise auf unselbständig enthaltene Werke |
525	|	Herkunftsangaben |
526	|	Titel von rezensierten Werken |
527	|	Hinweise auf parallele Ausgaben |
528	|	Titel von Rezensionen |
529	|	Titel von fortlaufenden Beilagen |
530	|	Titel von Bezugswerken |
531	|	Hinweise auf frühere Ausgaben und Bände |
533	|	Hinweise auf spätere Ausgaben und Bände |
534	|	Titelkonkordanzen |
535	|	Anzahl von Exemplaren |
536	|	Voraussichtlicher Erscheinungstermin |
537	|	Redaktionelle Bemerkungen |
538	|	Angabe der Vervielfältigungsart |
540	|	Internationale Standardbuchnummer (ISBN) |
541	|	Internationale Standardnummer für Musikalien (ISMN) |
542	|	Internationale Standardnummer für fortlaufende Sammelwerke (ISSN) |
543	|	Internationale Standardnummer für Reports (ISRN) |
544	|	Lokale Signatur |
546	|	Postvertriebskennzeichen |
550	|	Amtliche Druckschriftennummer |
551	|	Verlags-, Produktions- und Bestellnummer von Musikalien und Tonträgern |
552	|	Persistent Identifiers (PI) |
553	|	Artikelnummer |
554	|	Hochschulschriftennummer |
556	|	Reportnummer |
562	|	Patentnummer |
564	|	Normnummer |
566	|	Firmenschriftennummer |
568	|	Nationalbibliographienummer der CIP-Aufnahme |
570	|	Nationalbibliographienummer der falschen Aufnahme |
574	|	Nationalbibliographienummer (NBN) |
576	|	Pflichtablieferungsnummer |
578	|	Fingerprint |
580	|	Sonstige Standardnummer |
590	|	Hauptsachtitel und ggf. zu ergänzende Urheber der Quelle |
591	|	Verfasserangabe der Quelle |
592	|	Abteilung / Unterreihe der Quelle |
593	|	Ausgabebezeichnung der Quelle in Vorlageform |
594	|	Erscheinungsort der Quelle |
595	|	Erscheinungsjahr der Quelle |
596	|	Bandzählung, Jahreszählung, Heftzählung, Umfangs- und Illustrationsangabe der Quelle |
597	|	Gesamttitel der Quelle |
598	|	Fußnote der Quelle |
599	|	Standardnummern der Quelle |
600	|	1. Teil der Verweisung |
601	|	Bemerkungen zum 1. Teil der Verweisung |
602	|	2. Teil der Verweisung |
603	|	Bemerkungen zum 2. Teil der Verweisung |
646	|	Besitznachweis für die Verfilmungsvorlage |
647	|	Besitznachweis für den Sekundärform-Master |
651	|	Fußnote zur Computerdatei |
654	|	Systemvoraussetzungen für die Computerdatei |
655	|	Elektronische Adresse und Zugriffsart für eine Computerdatei im Fernzugriff |
659	|	Ergänzende Bemerkungen zur Computerdatei |
661	|	Angaben zum Text der Unterlage |
662	|	Angaben zum Äußeren der Unterlage |
663	|	Bezugswerke |
664	|	Provenienz |
669	|	Redaktionelle Bemerkungen zur Unterlage |
670	|	Sachtitel in abweichender Orthographie |
671	|	Andersschriftliche Darstellung |
672	|	Autorenname in normierter Form |
673	|	Ort in normierter Form |
674	|	Veranstaltungsjahr / Erscheinungsjahr des Originals |
675	|	Stichwörter in abweichender Orthographie |
680	|	Werkverzeichnis |
681	|	Angaben zum Musikwerk |
682	|	Angaben zum Musikincipit |
683	|	Angaben zur Besetzung |
700	|	Notation eines Klassifikationssystems |
705	|	DDC (Dewey Decimal Classification) analytisch |
710	|	Schlagwörter und Schlagwortketten |
711	|	Schlagwörter und Schlagwortketten nach anderen Regelwerken |
720	|	Stichwörter |
730	|	Precis |
740	|	Subject Headings |
750	|	1. Inhaltliche Zusammenfassung |
751	|	Verfasser der 1. inhaltlichen Zusammenfassung |
752	|	Sprachen der 1. inhaltlichen Zusammenfassung |
753	|	2. inhaltliche Zusammenfassung |
754	|	Verfasser der 2. inhaltlichen Zusammenfassung |
755	|	Sprachen der 2. inhaltlichen Zusammenfassung |
756	|	3. inhaltliche Zusammenfassung |
757	|	Verfasser der 3. inhaltlichen Zusammenfassung |
758	|	Sprachen der 3. inhaltlichen Zusammenfassung |