%distanza(F1, F2, D).
% ?- distanza([c,i,a,o], [k], D).
% ?- distanza([c,i,a,o], [c,i,a,o], D).
% ?- distanza([c,i,a,o], [i,a,o], D).
% ?- distanza([c,i,a,o], [i], D).

distanza([], [], 0).
distanza([H|T], [H|T], 0):- !.
distanza([H|T], [H1|T1], X):-
    permutazione([H|T], [H1|T1]),
    X is 1;
    remover(R, [R|T], _),
    append([H1|T1], [H|T], Z),
    duplicates(Z, _),
    X is 1.

permutazione([],[]).
permutazione([H|T],LPermPiuH):-
  	permutazione(T,LPerm),
    lista_con_elemento_in_piu(H,LPerm,LPermPiuH).

lista_con_elemento_in_piu(X,L,[X|L]).
lista_con_elemento_in_piu(X,[Y|L],[Y|Lcon]):-
    lista_con_elemento_in_piu(X,L,Lcon).

duplicates([],[]).

duplicates([A|R1],R2):-
    member(A,R1),
	duplicates(R1,R2).

duplicates([A|R1],[A|R2]):-
    \+ member(A,R1),
	duplicates(R1,R2).

remover( _, [], []).
remover( R, [R|T], T2) :-
    remover( R, T, T2).
remover( R, [H|T], [H|T2]) :-
    H \= R,
    remover( R, T, T2).
