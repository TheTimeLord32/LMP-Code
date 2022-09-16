%studente(Nome,Cognome,Matricola, Competenza1,Competenza2, Competenza3
%		,...,Competenza15) NO
%studente(Nome,Cognome,Matricola,[competenze])
%		
%corso(Nome,CompetenzaSoddisfatta1,CS2,CS3) NO
%corso(Nome,[CompetenzeSoddisfatte])

%piano_di_studi(StudenteConRichiestaDiCompetenze,Corsi):-
%Suppongo che studente e corso siano fatti prolog
%Suppongo che le competenze siano sempre messe in ordine alfabetico!!!!!

piano_di_studi(studente(_,_,_,[]),[]).

piano_di_studi(studente(Nome,Cognome,Matricola,Competenze)
               ,[corso(Nome,CompetenzeSoddisfatte)|T],QTA):-
    studente(Nome,Cognome,Matricola,Competenze),
    soddisfacompetenze(Competenze,CompetenzeSoddisfatte,Competenze1),
    piano_di_studi(studente(Nome,Cognome,Matricola,Competenze1),T).

soddisfaCompetenze([_],[],[_]).

%Sono competenze diverse CompetenzeStudente rimane uguale
soddisfaCompetenze([CH|CT],[CSH|CST],[CH|CT]):-
    soddisfacompetenze(CT,[CSH|CST],CT).
	

%Sono competenze diverse CompetenzeStudente rimane uguale
% - la competenza nell'esame
soddisfaCompetenze([CH|CT],[CH|CST],L):-
    privata_di(CH,[CH|CT],L),
    soddisfacompetenze(CT,CST,CT).

%One note personale
privata_di(XH,[XH|T],T).

privata_di(XH,[YH|YT],[YH|T]):-
    privata_di(XH,YT,T).

%S = Studente L= lista Corsi 
miglior_piano_di_studi(S,L,MIN):-
    setof((L, len) , piano_di_studi_e_lunghezza_lista(S,L, len),Corsi),
    min(Corsi,MIN).

piano_di_studi_e_lunghezza_lista(S,L, len):-
    piano_di_studi(S,L),
    len is lenght(L).
