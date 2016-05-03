package com.excilys.cdb.service;

import java.util.List;

import com.excilys.cdb.model.Computer;
import com.excilys.cdb.util.PageParameters;

public interface IComputerService {

    /**
     * delete a computer.
     *
     * @param id
     *            id of the computer to delete
     * @throws IllegalArgumentException
     *             exception
     */
    void deleteComputer(final Long id);

    /**
     * update a computer
     *
     * @param computer
     *            computer to update
     */
    void updateComputer(final Computer computer);

    /**
     * add a new computer to the database based on a computer object.
     *
     * @param c
     *            computer object to add to the database
     * @return instance of the computer with id updated
     */
    Computer createComputer(final Computer computer);

    /**
     * get computer by its id.
     *
     * @param id
     *            id of the computer
     * @return computer or null if invalid id or computer doesn't exist
     */
    Computer getComputer(final Long id);

    /**
     * get list of computers.
     *
     * @param page
     *            page parameters
     * @return the list of computers
     */
    List<Computer> getComputers(final PageParameters page);

    /**
     * get the number of computers.
     *
     * @return number of computers
     */
    public long countComputers(final PageParameters page);
}