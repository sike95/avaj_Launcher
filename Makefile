
DIR_PATH=src/avaj_launcher/

RUN_PATH=avaj_launcher.simulator.Simulator

LIBS=$(DIR_PATH)simulator $(DIR_PATH)simulator/vehicles  $(DIR_PATH)weather

complie:
	find . -name *.java > sources.txt
	@echo "Found all files"
	@javac -cp -sourcepath @sources.txt
	@echo "Compilation is done. Ready to Run."
	@echo "\nTo launch this program, Enter \"make run FILE=\" specify source file IMMEDIATELY after the = sign "

run:
	@cd src && java $(RUN_PATH) $(FILE)

clean:
	@rm sources.txt
	@for dir in $(LIBS); do \
		cd $$dir; \
		rm -f *.class; \
		cd -; \
		done
	@echo "Thank you. Come again"

