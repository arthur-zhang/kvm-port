/*
 * @(#)convert_md.h    1.2 00/11/22
 *
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

#ifndef _CONVERT_MD_
#define _CONVERT_MD_

extern int native2utf8(const char* from, char* to, int buflen);
extern int utf2native(const char* from, char* to, int buflen);

#endif
