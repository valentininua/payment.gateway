package io.yasiekz.github.hexagonaldddexample.domain.aggregate.visit.event;

import io.yasiekz.github.hexagonaldddexample.domain.event.Event;
import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@ToString
public class VisitCreated extends Event {

    UUID visitId;

}
