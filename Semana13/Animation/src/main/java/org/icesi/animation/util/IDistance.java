package org.icesi.animation.util;

import org.icesi.animation.model.Position;

@FunctionalInterface
public interface IDistance {
    double distance(Position from, Position to);
}
