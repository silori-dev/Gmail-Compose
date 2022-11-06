package com.xtremedevx.gmail.user.data

import com.xtremedevx.gmail.R

data class MailItem(
    val profileId: Int,
    val senderName: String,
    val mailSubject: String,
    val mailContent: String,
    val mailDate: String,

    )

val mailsList = listOf(
    MailItem(
        profileId = R.drawable.google_logo,
        senderName = "Google",
        mailSubject = "Job offer",
        mailContent = "jr. android dev role for ......",
        mailDate = "24 Aug",
    ),
    MailItem(
        profileId = R.drawable.facebook_logo,
        senderName = "Facebook",
        mailSubject = "Android dev role",
        mailContent = "Your resume has been accepted...",
        mailDate = "21 feb",
    ),
    MailItem(
        profileId = R.drawable.amazon_logo,
        senderName = "Amazon",
        mailSubject = "Interview round",
        mailContent = "Call for your first interview round.........",
        mailDate = "21 feb",
    ),
    MailItem(
        profileId = R.drawable.netflix_logo,
        senderName = "Netflix",
        mailSubject = "Second interview round",
        mailContent = "Congrats for clearing 1st interview round ...",
        mailDate = "21 feb",
    ),
    MailItem(
        profileId = R.drawable.dropbox_logo,
        senderName = "Dropbox",
        mailSubject = "Offer letter",
        mailContent = "Congratulating for clearing all three interview.....",
        mailDate = "24 aug",
    ),
    MailItem(
        profileId = R.drawable.twitter_logo,
        senderName = "Twitter",
        mailSubject = "jr. android dev role",
        mailContent = "We received your resume for jr. android....",
        mailDate = "21 feb",
    ),
    MailItem(
        profileId = R.drawable.signal_logo,
        senderName = "Signal",
        mailSubject = "Second Interview Round",
        mailContent = "Congrats for clearing 1st interview round ...",
        mailDate = "21 feb",
    ),

    MailItem(
        profileId = R.drawable.protonmail_logo,
        senderName = "Proton Mail",
        mailSubject = "Final Interview round",
        mailContent = "Congrats for clearing two interview round ...",
        mailDate = "21 feb",
    ),
    MailItem(
        profileId = R.drawable.dropbox_logo,
        senderName = "Dropbox",
        mailSubject = "3rd Interview",
        mailContent = "Thanks for showing interest in Dropbox....",
        mailDate = "20feb ",
    ),
    MailItem(
        profileId = R.drawable.protonmail_logo,
        senderName = "Proton Mail",
        mailSubject = "Application Received",
        mailContent = "Thanks for showing interest in Proton Mail",
        mailDate = "15 feb",
    ),
    MailItem(
        profileId = R.drawable.signal_logo,
        senderName = "Signal",
        mailSubject = "Application Received",
        mailContent = "Thanks for showing interest in Signal",
        mailDate = "15 feb",
    ),
    MailItem(
        profileId = R.drawable.protonmail_logo,
        senderName = "Netflix",
        mailSubject = "Application Received",
        mailContent = "Thanks for showing interest in Netflix",
        mailDate = "15 feb",
    ),
    MailItem(
        profileId = R.drawable.swiggy_logo,
        senderName = "Swiggy",
        mailSubject = "Interview round",
        mailContent = "Your resume has been accepted...",
        mailDate = "21 feb",
    ),

    )