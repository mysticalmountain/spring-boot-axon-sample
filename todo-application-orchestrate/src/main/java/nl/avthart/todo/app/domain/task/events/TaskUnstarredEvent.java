package nl.avthart.todo.app.domain.task.events;

import lombok.Value;

/**
 * @author albert
 */
@Value
public class TaskUnstarredEvent implements TaskEvent {

	private final String id;
}
