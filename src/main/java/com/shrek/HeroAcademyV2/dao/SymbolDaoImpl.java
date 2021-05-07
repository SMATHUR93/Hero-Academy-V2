package com.shrek.HeroAcademyV2.dao;

import com.shrek.HeroAcademyV2.model.Symbol;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class SymbolDaoImpl extends GenericDaoImpl<Symbol> implements ISymbolDao{
	
	@Transactional
	public List<Symbol> getAllSymbols() {
		return (List<Symbol>) findAll();
	}

	@Transactional
	public Symbol getSymbol(Long id){
		return (Symbol) find(id);
	}
	
	@Transactional
	public Symbol addSymbol(Symbol symbol){
		return (Symbol) create(symbol);
	}

	@Transactional
	public Symbol updateSymbol(Symbol symbol) {
		return (Symbol) update(symbol);
	}

	@Transactional
	public void deleteSymbol(Symbol symbol) {
		delete(symbol.getId());
	}

}
