package logger.interfaces;

import logger.enumns.ReportLevel;

public interface Layout {
	String stringFormat(String dateTime , String message, ReportLevel reportLevel);
}
