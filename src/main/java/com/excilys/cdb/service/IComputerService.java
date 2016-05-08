package com.excilys.cdb.service;

import java.util.List;

import com.excilys.cdb.model.Computer;
import com.excilys.cdb.model.Page;
import com.excilys.cdb.model.PageParameters;

public interface IComputerService {

    /**
     * delete a computer.
     *
     * @param id
     *            id of the computer to delete
     * @throws IllegalArgumentException
     *             exception
     */
    void deleteComputer(Long id);

    /**
     * update a computer.
     *
     * @param computer
     *            computer to update
     */
    void updateComputer(Computer computer);

    /**
     * add a new computer to the database based on a computer object.
     *
     * @param computer
     *            computer object to add to the database
     * @return instance of the computer with id updated
     */
    Computer createComputer(Computer computer);

    /**
     * get computer by its id.
     *
     * @param id
     *            id of the computer
     * @return computer or null if invalid id or computer doesn't exist
     */
    Computer getComputer(Long id);

    /**
     * get list of computers.
     *
     * @param page
     *            page parameters
     * @return the list of computers
     */
    List<Computer> getComputers(PageParameters page);

    /**
     * get the number of computers.
     *
     * @param page
     *            parameters for the count query.
     *
     * @return number of computers
     */
    long countComputers(PageParameters page);

    /**
     * returns the page of computer corresponding to the page parameters given.
     *
     * @param param
     *            parameters for the query.
     * @return page of computers.
     */
    Page<Computer> getComputersPage(PageParameters param);
}
