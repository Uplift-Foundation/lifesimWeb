package com.senecafoundation.lifesimweb.CRUD;

import com.senecafoundation.lifesimweb.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerRepoDataHandler implements IDataHandler<Player> {
    @Autowired
    PlayerRepository repo;

    @Override
    public void create(Player player) {
        repo.save(player);        
    }

    @Override
    public Player read() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Player update(Player player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Player player) throws Exception {
        // TODO Auto-generated method stub
        
    }
}
