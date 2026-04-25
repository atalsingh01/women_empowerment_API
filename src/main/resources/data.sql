-- ============================================================
-- WOMEN EMPOWERMENT APP - SEED DATA
-- ============================================================

-- ============================================================
-- 1. CONSTITUTIONAL RIGHTS
-- ============================================================
INSERT IGNORE INTO constitutional_rights (id, title, article_number, description) VALUES
(1, 'Right to Equality', 'Article 14',
'Every woman has the right to equality before the law. No person shall be discriminated against on the basis of religion, race, caste, sex, or place of birth. This means women and men are equal in the eyes of the law.'),

(2, 'Prohibition of Discrimination', 'Article 15',
'The State shall not discriminate against any citizen on grounds of sex. Special provisions can be made by the State for women and children. This article is the foundation of women-specific laws and schemes.'),

(3, 'Equal Opportunity in Employment', 'Article 16',
'All citizens have equal opportunity in matters of public employment. No woman can be denied a government job on the basis of gender. Women are entitled to the same pay and promotions as men.'),

(4, 'Right to Life and Personal Liberty', 'Article 21',
'Every woman has the right to live with dignity and personal freedom. No woman can be deprived of her life or liberty except according to procedure established by law. This covers protection from domestic violence and forced labor.'),

(5, 'Right Against Exploitation', 'Article 23',
'Traffic in human beings and forced labor are prohibited. No woman or girl can be sold, trafficked, or forced to work without pay. Violation of this right is a punishable criminal offense.'),

(6, 'Right to Education', 'Article 21A',
'The State shall provide free and compulsory education to all children aged 6 to 14 years. Every girl child has the right to attend school and receive basic education. Parents cannot legally deny education to a girl child.'),

(7, 'Right to Constitutional Remedies', 'Article 32',
'Every woman has the right to approach the Supreme Court for enforcement of her fundamental rights. If any fundamental right is violated, she can seek legal remedy through the courts. This is the right that protects all other rights.');

-- ============================================================
-- 2. GOVERNMENT SCHEMES
-- ============================================================
INSERT IGNORE INTO government_schemes (id, name, description, eligibility, benefit, ministry) VALUES
(1, 'Beti Bachao Beti Padhao',
'A scheme to address the declining child sex ratio and promote welfare of the girl child across India.',
'Girl children in selected districts across India.',
'Awareness campaigns, educational support, and welfare benefits for girl children.',
'Ministry of Women & Child Development'),

(2, 'Pradhan Mantri Matru Vandana Yojana (PMMVY)',
'A maternity benefit program providing financial assistance to pregnant and lactating women for their first live birth.',
'Pregnant and lactating women aged 19 years and above for first live birth.',
'Cash benefit of Rs. 5000 in three installments directly to bank account.',
'Ministry of Women & Child Development'),

(3, 'Sukanya Samriddhi Yojana',
'A savings scheme for the girl child that offers high interest rates and tax benefits to encourage parents to save for daughter education and marriage.',
'Girl children below 10 years of age. Account opened by parent or guardian.',
'High interest rate savings account, tax exemption under Section 80C, amount usable for education and marriage.',
'Ministry of Finance'),

(4, 'Mahila Shakti Kendra',
'A scheme to empower rural women through community participation and convergence of schemes at village level.',
'Rural women across India especially in tribal and backward areas.',
'Skill development, employment, digital literacy, health and nutrition support.',
'Ministry of Women & Child Development'),

(5, 'Support to Training and Employment Programme (STEP)',
'A scheme that provides skills to women and makes them self-reliant and aware of their health and rights.',
'Women above 16 years of age especially from marginalized communities.',
'Free vocational training in agriculture, handicrafts, computer skills, tailoring and more.',
'Ministry of Women & Child Development'),

(6, 'Ujjwala Yojana',
'A scheme to provide free LPG connections to women from BPL households to replace unclean cooking fuel.',
'Women from Below Poverty Line (BPL) households, SC/ST families, and poor households.',
'Free LPG connection with first cylinder and stove provided at no cost.',
'Ministry of Petroleum & Natural Gas'),

(7, 'PM Awas Yojana (Gramin)',
'Housing scheme that gives priority to women as the owner or co-owner of the house being built.',
'Homeless families and those living in kutcha houses in rural areas.',
'Financial assistance up to Rs. 1.20 lakh for construction of a pucca house with women as co-owner.',
'Ministry of Rural Development');

-- ============================================================
-- 3. LEGAL INFO
-- ============================================================
INSERT IGNORE INTO legal_info (id, law_name, year, description, key_points) VALUES
(1, 'Protection of Women from Domestic Violence Act', '2005',
'This law protects women from all forms of domestic violence including physical, emotional, sexual, and economic abuse by husband or family members.',
'Women can file a complaint at the nearest police station or court. A protection officer helps the woman get a protection order, residence order, and monetary relief. The law covers wives, live-in partners, mothers, sisters, and daughters.'),

(2, 'Dowry Prohibition Act', '1961',
'This law prohibits giving or taking dowry at the time of marriage. Demanding or giving dowry is a criminal offense punishable with imprisonment.',
'Punishment: minimum 5 years imprisonment and fine of Rs. 15,000 or value of dowry. Dowry death (Section 304B IPC) is punishable with 7 years to life imprisonment. Women can file complaint at local police station.'),

(3, 'Sexual Harassment of Women at Workplace Act (POSH)', '2013',
'This law protects women from sexual harassment at their workplace including offices, factories, hospitals, schools and even domestic workers.',
'Every organization with 10 or more employees must have an Internal Complaints Committee (ICC). Women can file a complaint within 3 months of the incident. Employer must take action within 60 days of complaint.'),

(4, 'Maternity Benefit Act', '1961',
'This law gives working women the right to paid leave before and after childbirth so they can take care of their newborn without losing income.',
'Paid maternity leave of 26 weeks for first two children. 12 weeks for third child. Nursing breaks allowed during working hours. Cannot be dismissed during maternity leave.'),

(5, 'Hindu Succession Act', '1956',
'This law gives equal rights to daughters in ancestral property. Daughters have the same rights as sons in their father property.',
'Daughters are coparceners in Hindu Undivided Family (HUF) property. Daughters have equal share in father self-acquired property. Married daughters also have equal right to parental property since 2005 amendment.'),

(6, 'The Prohibition of Child Marriage Act', '2006',
'This law prohibits marriage of girls below 18 years and boys below 21 years of age. Child marriage is illegal and punishable by law.',
'Minimum age for marriage: Girls - 18 years, Boys - 21 years. Child marriage can be declared void by the child on reaching adulthood. Offenders face up to 2 years imprisonment or fine of Rs. 1 lakh.'),

(7, 'Equal Remuneration Act', '1976',
'This law ensures that women are paid the same wages as men for the same or similar work. Employers cannot discriminate in pay on the basis of gender.',
'Employers must pay equal remuneration to men and women for same work. Cannot reduce wages of any worker to comply with this act. Labour Commissioner can inspect and take action against defaulting employers.');

-- ============================================================
-- 4. HELPLINES
-- ============================================================
INSERT IGNORE INTO helplines (id, name, number, description, available) VALUES
(1, 'Women Helpline (National)', '1091',
'National emergency helpline for women in distress. Police assistance available for any form of violence, harassment, or danger.',
'24/7'),

(2, 'Domestic Violence Helpline', '181',
'Government helpline for women facing domestic violence. Connects you to shelter homes, counseling, and legal aid.',
'24/7'),

(3, 'Child Helpline', '1098',
'Emergency helpline for children and girls in need of care and protection. Also handles child marriage and trafficking complaints.',
'24/7'),

(4, 'Police Emergency', '100',
'National police emergency number. Call immediately in any emergency situation involving threat to life or safety.',
'24/7'),

(5, 'National Commission for Women (NCW)', '7827170170',
'Helpline by National Commission for Women to handle complaints of harassment, discrimination, and rights violations.',
'Monday to Saturday, 9 AM - 5 PM'),

(6, 'iCall Mental Health Helpline', '9152987821',
'Psychological counseling and mental health support helpline for women experiencing trauma, depression, or stress.',
'Monday to Saturday, 8 AM - 10 PM'),

(7, 'Anti Human Trafficking Helpline', '1800-419-8588',
'Report cases of human trafficking, forced labor, or missing women and girls. Toll-free number.',
'24/7'),

(8, 'Vandrevala Foundation Mental Health', '1860-2662-345',
'Free counseling and mental health support for women dealing with trauma, abuse, or emotional distress. Toll-free.',
'24/7');