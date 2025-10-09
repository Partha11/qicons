package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) {
            return _ChevronUpDown!!
        }
        _ChevronUpDown = ImageVector.Builder(
            name = "Outlined.ChevronUpDown",
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
                moveTo(8.25f, 15f)
                lineTo(12f, 18.75f)
                lineTo(15.75f, 15f)
                moveToRelative(-7.5f, -6f)
                lineTo(12f, 5.25f)
                lineTo(15.75f, 9f)
            }
        }.build()

        return _ChevronUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronUpDown: ImageVector? = null
