package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowLongDown: ImageVector
    get() {
        if (_ArrowLongDown != null) {
            return _ArrowLongDown!!
        }
        _ArrowLongDown = ImageVector.Builder(
            name = "Outlined.ArrowLongDown",
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
                moveTo(15.75f, 17.25f)
                lineTo(12f, 21f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.75f, -3.75f)
                moveTo(12f, 21f)
                verticalLineTo(3f)
            }
        }.build()

        return _ArrowLongDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLongDown: ImageVector? = null
