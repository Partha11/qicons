package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Outlined.Microphone",
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
                moveTo(12f, 18.75f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -6f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-6f, 7.5f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                verticalLineToRelative(-1.5f)
                moveToRelative(6f, 7.5f)
                verticalLineToRelative(3.75f)
                moveToRelative(-3.75f, 0f)
                horizontalLineToRelative(7.5f)
                moveTo(12f, 15.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(4.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(8.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                close()
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
