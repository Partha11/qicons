package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PaperClip: ImageVector
    get() {
        if (_PaperClip != null) {
            return _PaperClip!!
        }
        _PaperClip = ImageVector.Builder(
            name = "Outlined.PaperClip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(18.375f, 12.739f)
                lineToRelative(-7.693f, 7.693f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.364f, -6.364f)
                lineToRelative(10.94f, -10.94f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.5f, 7.372f)
                lineTo(8.552f, 18.32f)
                moveToRelative(0.009f, -0.01f)
                lineToRelative(-0.01f, 0.01f)
                moveToRelative(5.699f, -9.941f)
                lineToRelative(-7.81f, 7.81f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.112f, 2.13f)
            }
        }.build()

        return _PaperClip!!
    }

@Suppress("ObjectPropertyName")
private var _PaperClip: ImageVector? = null
