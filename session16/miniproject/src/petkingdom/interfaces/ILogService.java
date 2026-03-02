package petkingdom.interfaces;

import java.util.Stack;

import petkingdom.models.Log;

public interface ILogService {
    Stack<Log> getAll();

    void saveAction(Log log);

    Log undo();
}
