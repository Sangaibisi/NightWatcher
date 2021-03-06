package com.emrullah.mavac.Utility;

public class GeneralEnums {

    public enum PriorityModules{
        BASE(1),
        COMMON(2),
        ESB(2),
        OTHER(9);

        private int priority;

        PriorityModules(int priority) {
            this.priority = priority;
        }

        public int getpriority() {
            return priority;
        }

    }

    public enum PrioritySubModules{
        MODEL(1),
        VIEW_CONTROLLER(2);

        private int priority;

        PrioritySubModules(int priority) {
            this.priority = priority;
        }

        public int getpriority() {
            return priority;
        }

    }

}
