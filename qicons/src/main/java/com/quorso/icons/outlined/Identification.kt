package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Identification: ImageVector
    get() {
        if (_Identification != null) {
            return _Identification!!
        }
        _Identification = ImageVector.Builder(
            name = "Outlined.Identification",
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
                moveTo(15f, 9f)
                horizontalLineToRelative(3.75f)
                moveTo(15f, 12f)
                horizontalLineToRelative(3.75f)
                moveTo(15f, 15f)
                horizontalLineToRelative(3.75f)
                moveTo(4.5f, 19.5f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(21.75f, 6.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 4.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 19.5f)
                close()
                moveTo(10.5f, 9.375f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.75f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 0f)
                close()
                moveTo(11.794f, 15.711f)
                arcToRelative(6.721f, 6.721f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.17f, 0.789f)
                arcToRelative(6.721f, 6.721f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.168f, -0.789f)
                arcToRelative(3.376f, 3.376f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.338f, 0f)
                close()
            }
        }.build()

        return _Identification!!
    }

@Suppress("ObjectPropertyName")
private var _Identification: ImageVector? = null
